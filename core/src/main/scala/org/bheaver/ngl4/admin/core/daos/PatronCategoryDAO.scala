package org.bheaver.ngl4.admin.core.daos
import org.bheaver.ngl4.admin.core.patronCategoryModel._

trait PatronCategoryDAO {

  def getPatronCategory(getPatronCategoryRequest: GetPatronCategoryRequest):GetPatronCategoryResponse


}
class PatronCategoryImpl(getPatronCategoryRequest: GetPatronCategoryRequest)  extends PatronCategoryDAO {
  override def getPatronCategory(getPatronCategoryRequest: GetPatronCategoryRequest): GetPatronCategoryResponse = ???

}