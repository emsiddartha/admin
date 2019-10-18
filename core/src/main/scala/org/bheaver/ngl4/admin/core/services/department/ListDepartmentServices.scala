package org.bheaver.ngl4.admin.core.services.department

import org.bheaver.ngl4.admin.core.models.departmentModels._
import org.bheaver.ngl4.admin.core.models.generalModels._

import scala.concurrent.Future

trait ListDepartmentServices {

  def validateHTTPRequest(listDepartmentsHttpRequestVO: ListDepartmentsHttpRequestVO): Either[List[HTTPValidationError],ListDepartmentsRequestVO]

  def listDepartments(listDepartmentsRequestVO: ListDepartmentsRequestVO): Future[ListDepartmentsResponseVO]

}

class ListDepartmentServicesImpl extends ListDepartmentServices {
  override def listDepartments(listDepartmentsRequestVO: ListDepartmentsRequestVO): Future[ListDepartmentsResponseVO] = ???

  override def validateHTTPRequest(listDepartmentsHttpRequestVO: ListDepartmentsHttpRequestVO): Either[List[HTTPValidationError], ListDepartmentsRequestVO] = ???
}