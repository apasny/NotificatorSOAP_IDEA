import com.apasny.soap.Command;
import com.apasny.soap.CommandImplService;
import com.apasny.soap.SetOfUser;

public class Main {

    public static void main(String[] args) {

        CommandImplService command = new CommandImplService();

        Command command1 = command.getCommandImplPort();

        SetOfUser users = command1.getAllUsersInGroup("adwdwad");

        System.out.print(users.getItem().get(0).getFullName());

    }

}
