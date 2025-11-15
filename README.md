# 📝 Tasks API – Spring Boot REST

API REST básica para gestionar tareas.  
Permite listar, crear, obtener por ID, actualizar y eliminar tareas.  
Proyecto realizado para practicar backend real usando Java y Spring Boot con arquitectura organizada.

---

## 🚀 Tecnologías utilizadas

- Java 17  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- H2 Database (en memoria)  
- Maven  

---

## 📦 Modelo de datos (Task)

- id: número  
- title: texto  
- description: texto  
- completed: boolean  

---

## 🔗 Endpoints

### Listar todas las tareas  
`GET /api/tasks`

### Obtener tarea por ID  
`GET /api/tasks/{id}`

### Crear tarea  
`POST /api/tasks`  
Body requerido:  
- title  
- description  
- completed  

### Actualizar tarea  
`PUT /api/tasks/{id}`  
Body requerido:  
- title  
- description  
- completed  

### Eliminar tarea  
`DELETE /api/tasks/{id}`

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio  
2. Abrir el proyecto en tu IDE  
3. Ejecutar con Maven:  
   `mvn spring-boot:run`  
4. La API estará disponible en:  
   `http://localhost:8080/api/tasks`

---

## 🗄 Base de datos H2

Consola (si está habilitada):  
`http://localhost:8080/h2-console`

---

## 📌 Estado del proyecto

- CRUD funcional  
- Arquitectura limpia (Controller → Service → Repository)  
- Respuestas y peticiones en JSON  
- Base H2 temporal en memoria  
- Ideal para portfolio como proyecto backend inicial  

---

## 🧩 Mejoras futuras

- DTOs  
- Validaciones  
- Manejo de errores  
- Documentación con Swagger  
- Tests unitarios  

---

<p align="center"><i>Study Hard · Work Hard</i></p>
