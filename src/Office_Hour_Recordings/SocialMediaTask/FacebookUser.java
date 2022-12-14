package Office_Hour_Recordings.SocialMediaTask;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia{


    /*

    Facebook User:

(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends

(*) Encapsulate all the variables.

(*) Create a constructor which will create a facebook user by taking username and password.
	- If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
	- Create and assign the the user's person url by taking 'facebook.com/' and adding their username
	- Set the account length to 0

	- Set the platform for "Facebook" using static block

(*) Overload the constructor to accept username, password, and the user’s name.
	- If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’

(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
	- Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.

(*) Implement all methods coming from Social Media class

	(*) Direct messaging(String username, String message)
		- print = %message sent to %username

	(*) Post(String body)
		- Should be added to the the ArrayList of Posts of the user

	(*) Notifications(int time)
		- Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"

(*) Override the toString method to print all of the information of a Facebook user when they are searched.

(*) Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
	- If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
	- If the user you are trying to send the request to has already hit the limit then print “theUsersName cannot accept any more friend request.
	- If both you and the user are under the limit print “Friend request sent to theUsersName” and increase your number of friends by one.

     */

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;

    static  {
        platform = "Facebook";
    }

    public FacebookUser(String username, String password) {

        if(password.contains(username)) {
            System.out.println("Password contains username. Default password set: password");
            this.password = "password";
        } else {
            this.password = password;
        }

        this.username = username;
        this.url = "facebook.com/" + this.username;
        this.accountLength = 0;
        allPosts = new ArrayList<>();

    }

    public FacebookUser (String username, String password, String fullName) {
        this(username, password);

        boolean isValidName = true;


        for(int i=0; i < fullName.length(); i++) {

            if(fullName.charAt(i) == ' ') continue;

            if(!Character.isLetter(fullName.charAt(i))) {
                isValidName = false;
                break;
            }

        }

        if(isValidName) {
            this.fullName = fullName;
        } else {
            System.out.println("Invalid name");
            this.fullName = "no name";
        }

    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username, password, fullName);

        if(age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }

        if(numberOfFriends < 0) {
            System.out.println("Invalid number of friends");
        } else {
            this.numberOfFriends = numberOfFriends;
        }

    }

    public boolean sendFriendRequest(FacebookUser otherUser) {
        boolean valid = false;
        if(this.numberOfFriends > 5000) {
            System.out.println("You have reached the max number of friends");
        } else if(otherUser.numberOfFriends > 5000) {
            System.out.println(otherUser.fullName + " has reached the max number of friends");
        } else {
            System.out.println("Friend request sent to " + otherUser.fullName);
            this.numberOfFriends++;
            otherUser.numberOfFriends++;
            valid = true;
        }

        return valid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to: "  + username);
    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));
    }

    @Override
    public void notification(int time) {  // time will be 24 format
        //  8 am to 5 pm
        if(time >= 8 && time <= 17 ) {
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }


    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }
}
