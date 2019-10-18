package org.bheaver.ngl4.admin.core.models

package object departmentModels {

  case class ListDepartmentsHttpRequestVO(id: String, sortBy: String)

  case class ListDepartmentsRequestVO(id: Int, sortBy: String)

  case class ListDepartmentsResponseVO(departments: List[BaseDepartmentVO])

  case class BaseDepartmentVO(departmentId: Int, departmentName: String)

}
