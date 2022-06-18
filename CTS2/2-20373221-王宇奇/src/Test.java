import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String argStr;
        String[] str;
        // 0 代表普通模式，1代表超级管理员模式
        int userMode = 0;
        var check = new Check();
        var manage = new Management();
        while (true) {
            argStr = in.nextLine();
            if(argStr.equals("QUIT")){
                System.out.print("----- Good Bye! -----");
                break;
            }
            str = argStr.split(" ");
            // addUser命令
            if(str[0].equals("addUser")) {
                if(check.checkAddUser(str)){
                    var user = new User();
                    user.addUser(str);
                }
            }
            // TunakTunakTun与NutKanutKanut命令
            else if(str[0].equals("TunakTunakTun")) {
                if(check.checkTuna(userMode, str)){
                    userMode = 1;
                    System.out.println("DuluDulu");
                }
            }
            else if(str[0].equals("NutKanutKanut")){
                if(check.checkNut(userMode, str)){
                    userMode = 0;
                    System.out.println("DaDaDa");
                }
            }
            // addLine与delLine命令
            else if(str[0].equals("addLine")){
                if(check.checkAddLine(userMode, str)){
                    manage.addLine(str);
                }
            }
            else if(str[0].equals("delLine")){
                if(check.checkDelLine(userMode, str)){
                    manage.delLine(str);
                }
            }
            else if(str[0].equals("addStation")){
                if(check.checkAddStation(userMode, str)){
                    manage.addStation(str);
                }
            }
            else if(str[0].equals("delStation")){
                if(check.checkDelStation(userMode, str)){
                    manage.delStation(str);
                }
            }
            else if(str[0].equals("lineInfo")){
                if(check.checkLineInfo(str)){
                    manage.lineInfo(str);
                }
            }
            else if(str[0].equals("listLine")){
                if(check.checkListLine(str)){
                    manage.listLine();
                }
            }
            else if(str[0].equals("addTrain")){
                if(check.checkAddTrain(userMode, str)){
                    manage.addTrain(str);
                }
            }
            else if(str[0].equals("delTrain")){
                if(check.checkDelTrain(userMode, str)){
                    manage.delTrain(str);
                }
            }
            else if(str[0].equals("checkTicket")){
                if(check.checkCheckTicket(userMode, str)){
                    manage.checkTicket(str);
                }
            }
            else if(str[0].equals("listTrain")){
                if(check.checkListTrain(str)){
                    manage.listTrain(str);
                }
            }
            else {
                System.out.println("Command does not exist");
            }
        }
    }
}
