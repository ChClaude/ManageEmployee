package ManageEmployee;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunEmployee {

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<Employee>();
        e.add(new Employee("Florica", "TCHAMBILA",1993,"3000", "ftchambila@gmail.com"));
        e.add(new Employee("Claude", "DE-TCHAMBILA",1999,"2600", "christ.tchambila@gmail.com"));
        e.add(new Employee("Garozy", "EXUPERY",1987,"3500", "garozy_exupery@gmail.com"));
        e.add(new Employee("Nick", "ORNELY",1989,"3200", "nickornely@gmail.com"));
        e.add(new Employee("Precious", "TCHAMBILA",1994,"2099", "prjeancy@gmail.com"));
        Collections.sort(e);
        //System.out.println(e);
        JOptionPane.showMessageDialog(null, e, "Output", JOptionPane.INFORMATION_MESSAGE);

    }

}
