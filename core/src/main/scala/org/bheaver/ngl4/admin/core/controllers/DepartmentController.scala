package org.bheaver.ngl4.admin.core.controllers

import java.util.concurrent.CompletionStage

import javax.servlet.http.HttpServletResponse
import org.bheaver.ngl4.admin.core.services.department.ListDepartmentServices
import org.springframework.beans.factory.annotation.{Autowired, Qualifier}
import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}
import org.bheaver.ngl4.admin.core.models.departmentModels._
import org.bheaver.ngl4.admin.core.models.generalModels._
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization._

import scala.compat.java8.FutureConverters.FutureOps
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@RestController
class DepartmentController {

  @Autowired
  @Qualifier("ListDepartmentServices")
  var listDepartmentServices:ListDepartmentServices = null

  @GetMapping(Array("admin/department/v1/get"))
  def listDepartments(httpServletResponse: HttpServletResponse,
                     @RequestParam(name = "id", required = false) idStr: String,
                     @RequestParam(name = "sortBy", required = false) sortBy: String): CompletionStage[String] = {

    val eitherVal  = listDepartmentServices.validateHTTPRequest(ListDepartmentsHttpRequestVO(idStr,sortBy))
    implicit val formats = DefaultFormats
    val futureJSONString = eitherVal match {
      case Left(value) =>{
        httpServletResponse.setStatus(400)
        Future( write(value))
      }
      case Right(value) => {
          listDepartmentServices.listDepartments(value).map(response => write(response))
      }
    }
    futureJSONString.toJava
  }

}
