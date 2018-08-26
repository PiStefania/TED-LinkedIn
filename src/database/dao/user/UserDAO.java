package database.dao.user;

import java.util.List;
import database.entities.User;

public interface UserDAO 
{
	public User find(int id);

    public List<User> list();

    public int create(User user);
    
    public int count();
    
    public List<User> searchByName(String name);
    
    public List<User> searchBySurname(String surname);
    
    public List<User> searchByNameAndSurname(String name, String surname);
        
    public User matchUserLogin(String email,String password);
    
    public List<User> getConnections(int user_id);
    
    public List<User> listWithConnectedField(int user_id);
    
    public int connectToUser(int user_id1, int user_id2);
    
    public int updateSettings(int user_id, String email, String password);
    
}