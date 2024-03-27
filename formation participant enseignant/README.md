# Formation Management Exercise

This project manages formations, teachers, and participants within a learning environment.

This Java exercise involves creating three classes: `Enseignant`,  `Formation` and `Participant`.

## Enseignant (Teacher)

- Attributes: `nom` (String), `specialite` (String)
- Methods: `Enseignant(String nom, String specialite)`, `getNom(): String`, `getSpecialite(): String`, `afficher(): void`

## Formation 

- Attributes: `nom` (String), `ens` (Enseignant)
- Methods: `setNom(String nom): void`, `getNom(): String`, `setEns(Enseignant ens): void`, `getEns(): Enseignant`, `Formation(String nom, Enseignant ens)`, `afficher(): void`

## Participant

- Attributes: `nom` (String), `specialite` (String),  `Form` (Formation)
- Methods: `Participant(String nom, String specialite)`, `affecterFormation(Formation f): void`, `afficher(): void`

### Instructions

- Create formations and assign teachers.
- Assign participants to formations based on specialties.