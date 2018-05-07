/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restclient.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import restclient.Friendship;


//
import javax.persistence.Query;


/**
 *
 * @author CPZHOUCHENG
 */
@Stateless
@Path("restclient.friendship")
public class FriendshipFacadeREST extends AbstractFacade<Friendship> {

    @PersistenceContext(unitName = "assignmentonePU")
    private EntityManager em;

    public FriendshipFacadeREST() {
        super(Friendship.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Friendship entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Friendship entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Friendship find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Friendship> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Friendship> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
////////////////////
    
    @GET
    @Path("Friendship.findByFriendshipid/{friendshipid}")
        @Produces({"application/json"})
        public List<Friendship> findByFriendshipid(@PathParam("friendshipid") int friendshipid)
        {Query query = em.createNamedQuery("Friendship.findByFriendshipid");
                query.setParameter("friendshipid", friendshipid);
                return query.getResultList();
        }
    
    
    @GET
    @Path("Friendship.findByStartdate/{startdate}")
        @Produces({"application/json"})
        public List<Friendship> findByStartdated(@PathParam("startdate") int startdate)
        {Query query = em.createNamedQuery("Friendship.findByStartdate");
                query.setParameter("startdate", startdate);
                return query.getResultList();
        }
        
    @GET
    @Path("Friendship.findByEnddate/{enddate}")
        @Produces({"application/json"})
        public List<Friendship> findByEnddate(@PathParam("enddate") int enddate)
        {Query query = em.createNamedQuery("Friendship.findByEnddate");
                query.setParameter("enddate", enddate);
                return query.getResultList();
        }        
        
    @GET
    @Path("Friendship.findByFriendid/{friendid}")
        @Produces({"application/json"})
        public List<Friendship> findByFriendid(@PathParam("friendid") int friendid)
        {Query query = em.createNamedQuery("Friendship.findByFriendid");
                query.setParameter("friendid", friendid);
                return query.getResultList();
        }
            
        
        
    
    
}
