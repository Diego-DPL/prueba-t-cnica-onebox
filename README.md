# Prueba Técnica Onebox - Carrito de Compra

Este proyecto es una implementación de un backend simple para un e-commerce, desarrollado como parte de una prueba técnica para Onebox. La aplicación está construida usando **Java** y **Spring Boot**, siguiendo una arquitectura de microservicios.

## Características

- **Crear un carrito:** Se puede crear un carrito que contendrá productos.
- **Agregar productos al carrito:** Los productos (definidos por un ID, descripción y cantidad) pueden ser añadidos a un carrito existente.
- **Obtener información de un carrito:** Se puede obtener la información de un carrito dado su ID.
- **Eliminar un carrito:** Un carrito puede ser eliminado manualmente o automáticamente después de 10 minutos de inactividad.
- **Persistencia en memoria:** Los datos se almacenan en memoria y no se utiliza ninguna base de datos para este proyecto.
  
## Tecnologías utilizadas

- **Java 21**
- **Spring Boot 3.3.2**
- **JUnit 5** para pruebas unitarias
- **Maven** como herramienta de gestión de dependencias

## Requisitos previos

- Java 21 o superior
- Maven 3.6.3 o superior

## Ejecución del proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/Diego-DPL/prueba-t-cnica-onebox.git
cd prueba-t-cnica-onebox
