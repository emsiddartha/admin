package org.bheaver.ngl4.admin.core.services

import org.bheaver.ngl4.admin.core.patronCategoryModel
import org.bheaver.ngl4.admin.core.patronCategoryModel._
trait GetPatronCategoryServices {
  def getPatronCategoryService(getPatronCategoryRequest: GetPatronCategoryRequest):GetPatronCategoryResponse

}
class GetPatronCategoryImpl extends GetPatronCategoryServices {
  override def getPatronCategoryService(getPatronCategoryRequest: patronCategoryModel.GetPatronCategoryRequest): patronCategoryModel.GetPatronCategoryResponse = ???

}
