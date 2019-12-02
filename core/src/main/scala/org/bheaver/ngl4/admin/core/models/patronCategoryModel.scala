package org.bheaver.ngl4.admin.core

package object patronCategoryModel {

  case class GetPatronCategoryRequest(id:Int,sortBy:String)
  case class GetPatronCategoryResponse(list:List[PatronCategoryRecord])
  case class PatronCategoryRecord(id:Int,name:String)




}
