# JPACRUDProject

<!-- PROJECT LOGO -->

<!-- TABLE OF CONTENTS -->

<details>
  <summary>Table of Contents</summary>
  <ul>
    <li>
      <a href="#about-the-project">About The Project</a>
  </ul>
      <ul>
        <li><a href="#technologies-used">Technologies Used</a></li>
      </ul>
    </li>
  <ul>
    <li><a href="#howitworks">How It Works</a></li>
  </ul>  
  <ul>
    <li><a href="#contact">Contact</a></li>
  </ul>

  <ul>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
    </ul>

</details>

<!-- ABOUT THE PROJECT -->

## About The Project

<p>JPACRUD Project is a Dynamic Web Application that allows the user to perform the following operations on a Video Game in the MYSQL Video Game Database.</p>
<ol>
<li><strong><em>C</em></strong>reate - Create a new Video Game in the database with the "Create a new Video Game" Link</li>
<br>
<li><strong><em>R</em></strong>ead - View the current information for a Video Game in the database</li>
<br>
<li><strong><em>U</em></strong>pdate - Update Predefined Fields of a Video Game in the database</li>
<br>
<li><strong><em>D</em></strong>elete - Remove Existing Video Games in the database</li>
</ol>
<!--[![Product Name Screen Shot][product-screenshot]](https://example.com) -->

<p align="right">(<a href="#top">back to top</a>)</p>

### Technologies Used

-   [Spring Tools 4](https://spring.io/tools)
-   [Gradle Build Tool](https://gradle.org/install/)
-   [MAMP Free](https://www.mamp.info/en/mac/)
-   [Apache Tomcat v8.5](https://tomcat.apache.org/)
-   [MySQL](https://www.mysql.com/)
-   [Atom Text Editor](https://atom.io/)
-   [Bootstrap v5.1](https://getbootstrap.com)

<p align="right">(<a href="#top">back to top</a>)</p>

## How It Works

<ol>
<li>
The JPACRUDProject Dynamic Web App is Run on a Apache Tomahawk v8.5 server and launched through Spring Tool Suite 4
</li>
<li>
Upon Launch we are brought to Home Page reflected in <strong>/WEB-INF/index.jsp</strong>
</li>
<li>
<strong>Find Video Game By Id</strong> navigates to <strong>findVideoGameById.html</strong> where the user is prompted for the VideoGame Id they would like to retrieve from the database.
</li>
<ul>
<li>All information for the requested Video Gaem is then retrieved by way of the SpringMVC provided <strong>findById.do</strong> RequestMapping found in the <strong>VideogameController.java</strong>
</li>
<li>User is then prompted with Two options for the displayed Video Game</li>
  <ol>
    <li>Delete Video Game</li>
      <ul>
        <li>The selected video game is removed from the database by way of the SpringMVC provided <strong>deleteVideoGame.do</strong> RequestMapping found in the VideogameController.java and user is returned to the aforementioned homepage at <strong>/WEB-INF/index.jsp</strong></li>
      </ul>
    <li>Update Film</li>
      <ul>
        <li>
        The selected film is displayed for editing through <strong>updateVideoGame.html</strong> with the current values shown</li>
        <li>
        User can then change all given fields to their preferred input and apply them to the database by way of the SpringMVC provided updateVideoGame.do RequestMapping found in the VideogameController.java and then user is returned to the aforementioned homepage at <strong>/WEB-INF/index.jsp</strong>
        </li>
      </ul>
  </ol>

</ul>
<li>
<strong>Create a Video Game</strong> navigates to <strong>createVideoGame.html</strong> where the user is prompted to enter the Video game's info.
</li>
  <ul>
    <li>
    When user selects the Submit button all inputed fields are added to the database by way of the SpringMVC provided <strong>addVideoGame.do</strong> RequestMapping found in the <strong>VideogameController.java</strong> and then user is returned to the aforementioned homepage at <strong>/WEB-INF/index.jsp</strong>
    </li>
  </ul>
</ol>

<p align="right">(<a href="#top">back to top</a>)</p>

## Contact

<strong>Developers on Project</strong>

<h4>Anthony Butler</h4>

<ul>
<li><a href="http://www.linkedin.com/in/anthony-tyler-butler">LinkedIn</a></li>
<li><a href="https://github.com/anthonyb0824">Github</a></li>
<li> E-mail: anthonybutler0824@gmail.com</li>
</ul>

Project Link: [JPACRUDProject](https://github.com/anthonyb0824/JPACRUDProject)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

-   [Film Query App Foundation](https://github.com/anthonyb0824/FilmQueryProject)
-   [Film Query App Reference #1](https://github.com/Cagugu/FilmQueryProject)
-   [Film Query App Reference #2](https://github.com/acorneld/FilmQueryProject)
-   [Stack Overflow](https://stackoverflow.com/)
-   [W3 Schools](https://www.w3schools.com/)
-   [Github - othneildrew](https://github.com/othneildrew/Best-README-Template)

<p align="right">(<a href="#top">back to top</a>)</p>
