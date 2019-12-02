package org.bheaver.ngl4.admin.core.services

import org.bheaver.ngl4.admin.core.models.departmentModels.{ListDepartmentsHttpRequestVO, _}
import org.bheaver.ngl4.admin.core.models.generalModels._
import org.bheaver.ngl4.admin.core.models._

import scala.concurrent.Future
import scala.util.Try

trait ListDepartmentServices {

  def validateHTTPRequest(listDepartmentsHttpRequestVO: ListDepartmentsHttpRequestVO): Either[List[HTTPValidationError], ListDepartmentsRequestVO]

  def listDepartments(listDepartmentsRequestVO: ListDepartmentsRequestVO): Future[ListDepartmentsResponseVO]

}

class ListDepartmentServicesImpl extends ListDepartmentServices {
  override def listDepartments(listDepartmentsRequestVO: ListDepartmentsRequestVO): Future[ListDepartmentsResponseVO] = ???

  override def validateHTTPRequest(listDepartmentsHttpRequestVO: ListDepartmentsHttpRequestVO): Either[List[HTTPValidationError], ListDepartmentsRequestVO] = {
    val errorList:List[HTTPValidationError] = List.empty
    val id:Int  = if(listDepartmentsHttpRequestVO.id ==null)
      -1
    else{
      if(Try(listDepartmentsHttpRequestVO.id.toInt).isSuccess)
        listDepartmentsHttpRequestVO.id.toInt
      else{
        errorList :+ HTTPValidationError("id","id must be an integer")
        -1
      }
    }

    val sortBy: String = if(listDepartmentsHttpRequestVO.sortBy == null)
      ""
    else{
      if(listDepartmentsHttpRequestVO.sortBy.equals("name"))
        listDepartmentsHttpRequestVO.sortBy
      else{
        errorList :+ HTTPValidationError("sortBy", "sortBy only supports value name")
        ""
      }
    }
    if(errorList.size>0)
      Left(errorList)
    else
      Right(ListDepartmentsRequestVO(if(id == -1) ??? else id,if(sortBy == "") null else sortBy))
  }

}