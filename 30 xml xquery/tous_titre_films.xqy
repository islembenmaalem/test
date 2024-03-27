for $x in doc("Films.xml")/FILMS/FILM
where $x/TITRE="Titanic" and $x/ROLES/ROLE/PRENOM="Kate" 
return $x/ROLES/ROLE[NOM="Winslet"]/INTITULe


for $x in doc("Films.xml")/FILMS/FILM
where $x/TITRE="Titanic" and $x/ROLES/ROLE/PRENOM="Kate" 
return $x/ROLES/ROLE[NOM="Winslet"]/INTITULE‏