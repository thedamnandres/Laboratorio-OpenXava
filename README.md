# 🧾 Laboratorio OpenXava – Proyecto Facturación

## 📚 Descripción
Este repositorio contiene el proyecto **“Facturación”**, desarrollado como parte del **Laboratorio OpenXava – Videos 1 al 3**.  
El objetivo es comprender cómo OpenXava permite crear aplicaciones empresariales en Java de manera rápida, aplicando principios de **Verificación y Validación (V&V)** de software.

---

## 💡 Clases Principales y Código Relevante

El proyecto se organiza dentro del paquete `com.andres.facturacion` en la carpeta: `src/main/java/com/andres/facturacion/`
Dentro de esta estructura se encuentran los siguientes componentes:

### 🧱 Paquete `modelo/`
Contiene las entidades principales del negocio, generadas durante los videos del laboratorio:
- **`Cliente.java`** → Representa a los clientes de la aplicación.  
- **`Factura.java`** → Entidad principal que gestiona las facturas creadas en el sistema.  
- **`Fabricante.java`** → Representa al fabricante de los productos.
- **`Detalle.java`** → Define los ítems o productos asociados a cada factura.  
- **`Producto.java`** → Contiene la información de productos (nombre, precio, categoría).  
- **`Categoria.java`** → Clasifica los productos por tipo o grupo.  
- **`Direccion.java`** → Información de ubicación del cliente.  
- **`TuPrimeraEntidad.java`** → Primera entidad creada siguiendo el tutorial (Video 1).

### ⚙️ Paquete `calculadores/`
Lógica auxiliar usada en el negocio:
- **`CalculadorSiguienteNumeroParaYear.java`** → Genera automáticamente el siguiente número de factura según el año.

### 🚀 Paquete `run/`
Contiene las clases para ejecutar la aplicación:
- **`facturacion.java`** → Punto de entrada principal del proyecto (arranque de la aplicación).  
- **`.algo`** → Archivo auxiliar del entorno de ejecución.

### 🗂️ Otras carpetas relevantes
- **`data/`** → Archivos de la base de datos embebida HSQLDB (`facturacion-db.script`, `.log`, `.properties`).  
- **`resources/`** → Configuración adicional y propiedades del proyecto.  
- **`webapp/`** → Archivos de interfaz web generados por OpenXava.  
- **`pom.xml`** → Archivo de configuración **Maven** (dependencias y plugins del proyecto).  
- **`.gitignore`** → Define los archivos y carpetas que no se versionan (por ejemplo, `/target` o configuraciones del IDE).

---

## 🧪 Ejecución del Proyecto
1. Selecciona el file `run/facturacion.java`.  
2. Ejecuta el proyecto con ▶️ **Run**.  
3. Abre el navegador en: [http://localhost:8081/facturacion](http://localhost:8081/facturacion)
4. Inicia sesión con `admin / admin`.

---

## 🔗 Recursos
- [Documentación oficial de OpenXava](https://www.openxava.org/OpenXavaDoc/docs/index_es.html)
- [Tutoriales en video](https://www.youtube.com/playlist?list=PL60bTC1NPyZ7H3cWU2BW9gnyThLpnkgH8)

