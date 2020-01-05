package Locators;

public class shortVideoLocators_CssSelector {

        public static void main(String[] args) {

            /*
             *       Css Selectors
             *
             *           id  --> use #   -->  #alertbtn   ,   #opentab
             *
             *           class  -->  use . --> .dropbtn  ,   button[class='dropbtn']
             *
             *           different attributes   --> option[value='apple']   ,  input[onclick='displayConfirm()']
             *
             *           next sibling  ---> option[value='orange'] + option
             *
             *                   note : not able to find multiple next siblings   in xpath --> //option[@value='apple']/following-sibling::option
             *
             *           parent to child     -->  ul[class='deaultFunc']>li
             *
             *              nth-child(n)     --> specific child for us  -->  ul[class='deaultFunc']>li:nth-child(4)
             *             nth-last-child(n)     --> finding the child starting from the last one --> ul[class='deaultFunc']>li:nth-last-child(3)
             *             last-child           --> finding the last child --> ul[class='deaultFunc']>li:last-child
             *             first-child          --> finding the first child --> ul[class='deaultFunc']>li:first-child
             *
             *
             * urls -->>     https://learn.letskodeit.com/p/practice
             *
             *              http://demo.automationtesting.in/Selectable.html
             *
             */

        }

    }

