package facades;

import dtos.SignUpDTO;
import dtos.SignUpDTO;
import rest.entities.SignUp;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import errorhandling.NotFoundException;
import utils.EMF_Creator;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class FacadeExample {

    private static FacadeExample instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private FacadeExample() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static FacadeExample getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new FacadeExample();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public SignUpDTO create(SignUpDTO rm){
        SignUp rme = new SignUp(rm.getUserName(), rm.getUserPass());
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(rme);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new SignUpDTO(rme);
    }
    public SignUpDTO getById(long id) throws NotFoundException { //throws RenameMeNotFoundException {
        EntityManager em = emf.createEntityManager();
        SignUp rm = em.find(SignUp.class, id);
        if (rm == null)
            throw new NotFoundException("The RenameMe entity with ID: "+id+" Was not found");
        return new SignUpDTO(rm);
    }
    
    //TODO Remove/Change this before use
    public long getSignUpCount(){
        EntityManager em = getEntityManager();
        try{
            long signUpCount = (long)em.createQuery("SELECT COUNT(r) FROM SignUp r").getSingleResult();
            return signUpCount;
        }finally{  
            em.close();
        }
    }
    
    public List<SignUpDTO> getAll(){
        EntityManager em = emf.createEntityManager();
        TypedQuery<SignUp> query = em.createQuery("SELECT r FROM SignUp r", SignUp.class);
        List<SignUp> rms = query.getResultList();
        return SignUpDTO.getDtos(rms);
    }
    
    public static void main(String[] args) {
        emf = EMF_Creator.createEntityManagerFactory();
        FacadeExample fe = getFacadeExample(emf);
        fe.getAll().forEach(dto->System.out.println(dto));
    }

}
