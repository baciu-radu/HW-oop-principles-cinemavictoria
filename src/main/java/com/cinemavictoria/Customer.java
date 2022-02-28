package com.cinemavictoria;

public class Customer {
        private String name;
        private String email;
        private Integer telephone;

        public Customer(String name, String email, int telephone){
            this.name=name;
            this.email=email;
            this.telephone=telephone;
        }
        public String getName(){return name;}
        public String getEmail(){return email;}
        public Integer getTelephone(){return telephone;}

}
