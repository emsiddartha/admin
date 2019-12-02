package org.bheaver.ngl4.admin.core.conf

import org.bheaver.ngl4.admin.core.services.{ListDepartmentServices, ListDepartmentServicesImpl}
import org.bheaver.ngl4.admin.core.services.ListDepartmentServicesImpl
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class BeanFactory {

  @Bean(name = Array("ListDepartmentServices"))
  def getListDepartmentServices: ListDepartmentServices = new ListDepartmentServicesImpl
}
