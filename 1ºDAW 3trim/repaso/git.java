public class git{


    /*
  # 📘 Apuntes Git - Examen
  
  ## ✅ Instalación y Configuración Inicial
  
  ```bash
  git --version
  git config --global user.name "Tu Nombre"
  git config --global user.email "tu.email@ejemplo.com"
  git config --global core.editor "code --wait"
  ```
  
  ---
  
  ## 📁 Tarea S1R1: Git Básico
  
  ### Crear carpeta, inicializar repo y primer commit
  
  ```bash
  mkdir S1R1
  cd S1R1
  git init
  
  echo -e "Libro 1\nLibro 2\nLibro 3" > libros.txt
  git add libros.txt
  git commit -m "Primer commit: Añadidos 3 libros"
  ```
  
  ### Modificar archivo y segundo commit
  
  ```bash
  echo -e "Libro 4\nLibro 5" >> libros.txt
  git add libros.txt
  git commit -m "Segundo commit: Añadidos 2 libros más"
  ```
  
  ### Crear archivo películas y estado
  
  ```bash
  echo -e "Pelicula 1\nPelicula 2\nPelicula 3" > peliculas.txt
  git status
  ```
  
  ### Añadir archivo comidas y tercer commit
  
  ```bash
  echo -e "Comida 1\nComida 2\nComida 3" > comidas.txt
  git add peliculas.txt comidas.txt
  git commit -m "Tercer commit: Añadidas películas y comidas"
  ```
  
  ### Borrar archivo, editar otro y cuarto commit
  
  ```bash
  # Eliminar comidas.txt desde el explorador
  echo -e "Pelicula 4\nPelicula 5" >> peliculas.txt
  git status
  git add -A
  git status
  git commit -m "Cuarto commit: Modificado peliculas.txt y eliminado comidas.txt"
  ```
  
  ### Crear archivos ignorados y .gitignore
  
  ```bash
  echo -e "Libro 6\nLibro 7\nLibro 8" > datos.bak
  mkdir output
  echo "Tu Nombre y Apellidos" > output/salida.txt
  git status -u
  
  echo -e "*.bak\noutput/" > .gitignore
  git status
  git add .gitignore
  git commit -m "Commit .gitignore para ignorar archivos .bak y carpeta output"
  ```
  
  ### Ver historial
  
  ```bash
  git log --oneline
  ```
  
  ---
  
  ## 🔀 Tarea S2R1: Ramas y Merge
  
  ```bash
  mkdir S2R1 && cd S2R1
  git init
  
  echo -e "Actor 1\nActor 2\nActor 3" > actores.txt
  git add actores.txt
  git commit -m "Commit 1: Añadidos actores"
  
  git branch test
  git checkout test
  echo -e "Actriz 1\nActriz 2\nActriz 3" > actrices.txt
  git add actrices.txt
  git commit -m "Commit test: Añadidas actrices"
  git log --graph --all
  
  git checkout master
  git merge test
  ```
  
  ### Crear segunda rama con caminos diferentes
  
  ```bash
  git branch test2
  
  # En master
  echo "Actriz 4" >> actrices.txt
  git add actrices.txt
  git commit -m "master: Añadida Actriz 4"
  
  # En test2
  git checkout test2
  echo "Actriz 5" >> actrices.txt
  git add actrices.txt
  git commit -m "test2: Añadida Actriz 5"
  
  git log --graph --all
  
  # Fusionar y resolver conflicto
  git checkout master
  git merge test2
  # Si hay conflicto
  git status
  # Editar actrices.txt para conservar ambas líneas
  git add actrices.txt
  git commit -m "Conflicto resuelto: fusionadas actrices 4 y 5"
  ```
  
  ---
  
  ## 🌐 Tarea S2R2: Repositorio Remoto
  
  ```bash
  # Repositorio remoto vacío
  mkdir S2R2-remoto && cd S2R2-remoto
  git init --bare
  ```
  
  ### Clonar en local (S2R2) y trabajar
  
  ```bash
  git clone ../S2R2-remoto S2R2
  cd S2R2
  
  echo -e "Director 1\nDirector 2\nDirector 3" > directores.txt
  git add directores.txt
  git commit -m "Commit: Añadidos directores"
  git push origin master
  
  git checkout -b version1
  echo -e "Director 4\nDirector 5" >> directores.txt
  git add directores.txt
  git commit -m "version1: Añadidos más directores"
  git push -u origin version1
  ```
  
  ### Clonar en otra carpeta y sincronizar ramas
  
  ```bash
  git clone ../S2R2-remoto S2R3
  cd S2R3
  cat directores.txt
  git status
  
  git checkout version1
  cat directores.txt
  
  git checkout master
  git merge version1
  git push origin master
  ```
  
  ### Volver a S2R2 y actualizar desde remoto
  
  ```bash
  cd ../S2R2
  git fetch
  
  git pull origin master
  cat directores.txt
  ```
  
  ---
  
  ## 👤 GitHub: Cuenta e Integración
  
  ### Crear cuenta y activar educación
  - Crear cuenta en GitHub
  - Añadir correo educativo
  - Solicitar descuento educativo en GitHub Education
  
  ---
  
  ## 📄 Fork, Issues y Pull Request
  
  ### Fork y modificación
  
  ```bash
  git clone https://github.com/tu-usuario/sesion3-practica.git
  cd sesion3-practica
  
  echo "Tu nombre y apellidos" > README.md
  git add README.md
  git commit -m "Actualizado README con nombre"
  ```
  
  ### Crear issues y milestone
  
  - Crear issues: "Añadir 3 libros", "Añadir 3 películas", "Añadir 3 discos"
  - Crear milestone "Tareas sesión 3-2" y vincular issues
  
  ### Realizar tareas y cerrar issues
  
  ```bash
  echo -e "Libro X\nLibro Y\nLibro Z" >> libros.txt
  git add libros.txt
  git commit -m "close #1: Añadidos libros"
  
  echo -e "Pelicula A\nPelicula B\nPelicula C" >> peliculas.txt
  git add peliculas.txt
  git commit -m "close #2: Añadidas películas"
  
  echo -e "Disco 1\nDisco 2\nDisco 3" >> discos.txt
  git add discos.txt
  git commit -m "close #3: Añadidos discos"
  ```
  
  ### Subir cambios y crear PR
  
  ```bash
  git push origin main
  mkdir capturas && mv *.png capturas/
  git add capturas
  git commit -m "Añadidas capturas"
  git push
  ```
  
  - Crear pull request en GitHub indicando que se completó la tarea
  
  ---
  
  ## 🏢 Organizaciones en GitHub
  
  - Crear organización: `organizacion-sesion-3-tu-nombre-apellidos`
  - Crear repo: `sesion3-repo-organizacion`
    - README con tu nombre
    - .gitignore para Java
    - Licencia MIT
  
  - Crear equipo: `equipo1`
  - Dar permisos de escritura a `equipo1`
  - Invitar a `pedroprieto` a la organización y al equipo
   */
  
  }