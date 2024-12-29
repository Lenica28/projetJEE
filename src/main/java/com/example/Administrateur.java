package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.ArrayList;
import java.util.List;

public class Administrateur {
    @PersistenceContext
    private EntityManager entityManager;

    private List<Utilisateur>  utilisateurs = new ArrayList<Utilisateur>();

    public void creationUtilisateur(Utilisateur utilisateur)
    {
        entityManager.persist(utilisateur);
    }

    

    public List<Utilisateur> getUtilisateurs()
    {
        return utilisateurs;
    }

    public void supprimerUtilisateur(String utilisateurId)

    {
        utilisateurs.removeIf(utilisateur -> utilisateur.getId() == null);

    }
}
