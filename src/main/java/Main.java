import dao.UserDao;
import model.UserModel;

public class Main {
    public static void main(String[] args) {
        UserDao userDao= new UserDao();
        UserModel userModel= new UserModel();
        userDao.addUser(userModel);

    }
}
