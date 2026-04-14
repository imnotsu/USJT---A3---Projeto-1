package com.usjt.loginandsignup;

public class LoginAndSignup {

    public static void main(String[] args) {
        Login LoginFrame = new Login();
        LoginFrame.dispose();
        LoginFrame.setUndecorated(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); // centro
        LoginFrame.setResizable(false);
        LoginFrame.setVisible(true);
    }
}
