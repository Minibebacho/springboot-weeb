package com.jordy.curso.springtboot.webapp.springboot_weeb.models;

public class User {

   private String name;
   private String raza;
   private String email;
   public User(String name, String raza) {
    this.name = name;
    this.raza = raza;
}
  
   public User() {
   }

   public User(String name, String raza, String email) {
      this(name,raza);
      this.email = email;
   }

   public String getName() {
    return name;
   }
 

   public void setName(String name) {
    this.name = name;
   }
   public String getRaza() {
    return raza;
   }
   public void setRaza(String raza) {
    this.raza = raza;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }

}
