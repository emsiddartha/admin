package services

import org.bheaver.ngl4.admin.core.patronCategoryModel
import org.bheaver.ngl4.admin.core.services.GetPatronCategoryServices
import org.scalatest.FlatSpec

class GetPatronCategoryTests extends FlatSpec{
  "An empty set" should "have size zero" in {
    val getPatronCategorysevice=new GetPatronCategoryServices {
      override def getPatronCategoryService(getPatronCategoryRequest: patronCategoryModel.GetPatronCategoryRequest): patronCategoryModel.GetPatronCategoryResponse = ???
    }
    val l=getPatronCategorysevice.getPatronCategoryService(2 )
    assert(Set.empty.size!=0)
    println("Bagi")


  }
  it should "an empty list" in {
    assertThrows[NoSuchElementException]{
      Set.empty
    }

  }






}
