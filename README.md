# INTRODUCTION TO COMPLEX SYSTEMS, JAVA, MVN, AND GIT (AREP)
En este taller se realizaron los cálculos de media y desviación estándar a partir de una tabla con n números,se realizo la implementación propia de una Linkedlist en un proyecto realizado con `maven java`.

## informe

El informe se encuentra en este [LINK](Informe.pdf)

### Requerimentos

Se necesita tener el siguiente software en el computador:

```
$ Java 1.8
$ Maven 3.6.3
$ Git
$ IDLE (de su preferencia)
```

### Instalacion

Algunos de los comandos utilizados para la realización del taller fueron los siguientes.

## Creación del proyecto `maven java`.
```
$ mvn archetype:generate -DgroupId=edu.escuelaing.arem.ASE.app -DartifactId=miprimera-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Entrar al directorio de clases.

```
$ cd mi-primera-app/
```

## Construir el proyecto.

```
$ mvn package
```

## Ejecutar aplicativo.
```
$ java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.app.App
```

## Ejecutar Pruebas.
```
$ mvn test
```



## Autor

Verbo Julian Camacho Villamarin

## Herramientas

* [Intellij IDEA](https://www.jetbrains.com/es-es/idea/) - IDLE
* [Maven](https://maven.apache.org/) - Dependency Management
* [Github](https://github.com/VerboCamacho/AREP-TallerMvnGit) - Repository



## Licencia

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details

