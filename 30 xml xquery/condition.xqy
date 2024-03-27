(:<titles>
{for $x in doc("bookstore.xml")/bookstore/book
where $x/price=30
return $x/title}
</titles>:)

(:tous les titres des fimls:)
(:for $x in doc("Films.xml")/FILMS/FILM
return $x/TITRE:)

(:tous les titres de films triés par ordre alphabétique:)
(:for $x in doc("Films.xml")/FILMS/FILM
order by $x/title ascending
return $x/TITRE:)

(:les titres des films de Science-fiction:)
(:for $x in doc("Films.xml")/FILMS/FILM
where $x/GENRE="Science-fiction"
return $x/TITRE:)

(:le résumé du film Vertigo:)
(:for $x in doc("Films.xml")/FILMS/FILM
where $x/TITRE="Vertigo"
return $x/RESUME:)

(:le nombre de films dans le document :)
(:count(doc("Films.xml")/FILMS/FILM/TITRE):)

(:for $x in doc("Films.xml")/FILMS/FILM
where ($x/ROLES/ROLE/PRENOM="Kim" and $x/ROLES/ROLE/NOM="Novak") and ($x/ROLES/ROLE/PRENOM="James" and $x/ROLES/ROLE/NOM="Stewart")
return $x/TITRE:)

(:for $x in doc("Films.xml")/FILMS/FILM
where not($x/RESUME != "")
return $x/TITRE:)

(:for $x in doc("Films.xml")/FILMS/FILM
where ($x/RESUME != "")
return $x/TITRE:)


(:for $x in doc("Films.xml")/FILMS/FILM
where ($x/TITRE="Titanic") and ($x/ROLES/ROLE/NOM="Winslet" and $x/ROLES/ROLE/PRENOM="Kate")
return $x/ROLES/ROLE/INTITULE:)


(:for $f in doc("Films.xml")//FILM 
where $f/TITRE="Titanic" 
return for $r  in $f/ROLES/ROLE 
       where $r/PRENOM="Kate" and $r/NOM="Winslet" 
       return $r/INTITULE:)

(:for $f in doc("Films.xml")//FILM where $f/TITRE="Reservoir dogs" 
return for $r  in $f/ROLES/ROLE 
       where $r/PRENOM="Harvey" and $r/NOM="Keitel" 
       return $r/INTITULE:)
       
(:for $f in doc("Films.xml")//FILM 
where contains($f/TITRE,"A")
return $f/TITRE:)
(:2 question:)

(:for $f in doc("Films.xml")//FILM 
where $f/TITRE="film Eyes Wide Shut" and $f/MES/@idref = doc("Artiste.xml")/ARTISTES/ARTISTE@id
return $f/MES/@idref:)

(:for $a in doc("Artiste.xml")//ARTISTE
let $lf := for $f in doc("Films.xml")//FILM
          where $f/MES/@idref=$a/@id
          return <film>{$f/TITRE/text()}</film>
where count($lf)>0
return <artiste nom="{concat($a/ACTPNOM,' ', $a/ACTNOM)}">
         {$lf}
        </artiste>:)
        
(:for $f in doc("Films.xml")//FILM , $y in doc("Artiste.xml")//ARTISTE
where $f/MES/@idref=$y/@id and $f/TITRE="Eyes Wide Shut"
return($y/ACTNOM,$y/ACTPNOM) :)


(:for $ms in doc("Artiste.xml")//ARTISTE, $f in doc("Films.xml")//FILM, 
$r in $f/ROLES/ROLE where $f/MES/@idref=$ms/@id
and $r/PRENOM=$ms/ACTPNOM and $r/NOM=$ms/ACTNOM return $f/TITRE:)

🙂 Exemple 🙂
🙂 <titles>
{for $x in doc("bookstore.xml")/bookstore/book
where $x/price=30
return $x/title}
</titles> 🙂


🙂 premiere question 🙂


🙂 req 1 🙂
🙂 <titles>
{for $x in doc("Films.xml")/FILMS/FILM
return $x/TITRE}
</titles> 🙂

🙂 req 2 🙂
(:<titles>
{
for $x in doc("Films.xml")/FILMS/FILM
order by $x/TITRE ascending
return $x/TITRE 
}
</titles> 🙂

🙂 req 3 🙂
🙂 <titles>
{
for $x in doc("Films.xml")/FILMS/FILM
where $x/GENRE = "Science-fiction"
return $x/TITRE 
}
</titles> 🙂 

🙂 req 4 🙂
(:<Resume>
{
for $x in doc("Films.xml")/FILMS/FILM
where $x/TITRE = "Vertigo"
return $x/RESUME 
}
</Resume>:)

🙂 req 5 🙂
🙂 <count>
{
for $x in doc("Films.xml")/FILMS
return count($x/FILM)
}
</count> 🙂

🙂 req 6 🙂
🙂 <titles>
{
for $x in doc("Films.xml")/FILMS/FILM
where (($x/ROLES/ROLE/PRENOM  = "Kim" and $x/ROLES/ROLE/NOM  = "Novak") or ($x/ROLES/ROLE/PRENOM  = "James" and $x/ROLES/ROLE/NOM  = "Stewart"))
return $x/TITRE 
}
</titles> 🙂

🙂 req 7 🙂
(:<titre>
{
for $x in doc("Films.xml")/FILMS/FILM
where $x/RESUME !=""
return $x/TITRE 
}
</titre>:)

🙂 req 8 🙂
🙂 <titre>
{
for $x in doc("Films.xml")/FILMS/FILM
where not($x/RESUME != "")
return $x/TITRE 
}
</titre>:)

🙂 req 9 🙂
🙂 <titles>
{
for $x in doc("Films.xml")/FILMS/FILM/ROLES/ROLE
where $x/../../TITRE = "Titanic" and $x/PRENOM  = "Kate" and $x/NOM  = "Winslet"
return $x/INTITULE
}
</titles> 🙂

🙂 req 10 🙂
🙂 <titre>
{
for $x in doc("Films.xml")/FILMS/FILM
where contains($x/TITRE/text(), 'A')
return $x/TITRE 
}
</titre>:)

🙂 deuxieme question 🙂

🙂 req 1 🙂
🙂 <titre>
{
for $x in doc("Films.xml")/FILMS/FILM,$y in doc("Artiste.xml")/ARTISTES/ARTISTE
where $x/TITRE/text() = "Eyes Wide Shut" and $y/@id = $x/MES/@idref
return ($y/ACTNOM,$y/ACTPNOM)
}
</titre>:)

🙂 req 2 🙂
🙂 <titre>
{
for $x in doc("Films.xml")/FILMS/FILM/ROLES/ROLE ,$y in doc("Artiste.xml")/ARTISTES/ARTISTE
where $y/@id = $x/../../MES/@idref and $x/NOM = $y/ACTNOM  and $x/PRENOM= $y/ACTPNOM
return ($y/ACTNOM,$y/ACTPNOM)
}
</titre> 🙂

🙂 req 3 🙂
<titre>
{
for $x in doc("Films.xml")/FILMS/FILM/ROLES/ROLE ,$y in doc("Films.xml")/FILMS/FILM
where $x/NOM = $y/ROLES/ROLE/NOM  and $x/PRENOM= $y/ROLES/ROLE/PRENOM
return ($x/NOM,$x/PRENOM,$y/TITRE)
}
</titre>

