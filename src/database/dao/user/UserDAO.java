package database.dao.user;

import java.util.List;
import database.entities.User;

public interface UserDAO 
{
	public User find(int id);

    public List<User> list();

    public int create(User user);
    
    public int count();
    
    public List<User> searchByName(String name, int user_id);
    
    public List<User> searchBySurname(String surname, int user_id);
    
    public List<User> searchByNameAndSurname(String name, String surname, int user_id);
        
    public User matchUserLogin(String email,String password);
    
    public List<User> getConnections(int user_id);
    
    public List<User> listWithConnectedField(int user_id);
    
    public int connectToUser(int user_id1, int user_id2);
    
    public int updateSettings(int user_id, String email, String password);
    
    public User getUserProfile(int id);
    
    public int updateUser(User user, int user_id);
    
    public List<User> existingListWithConnectedField(int user_id, List<User> users);
    
}
