package com.matheus.cursojava.labsAula36;

public class Professor {

		private String nome;
		private String departamento;
		private String email;
		
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		
		public void setNome (String nome) {
			this.nome = nome;
		}
		public String getNome () {
			return this.nome;
			
		}
	
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
