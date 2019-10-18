package org.bheaver.ngl4.admin.core

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AdminApp

object AdminApp extends App{
  SpringApplication.run(classOf[AdminApp])
}