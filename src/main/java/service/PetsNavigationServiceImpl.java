package service;

/**
 * Created by artoves on 11/08/16.
 */
public class PetsNavigationServiceImpl implements NavigationService {

    public void navigateToPage(String pageName) {
        System.out.println("I navigated to the " + pageName + " page");
    }

    public void pressButon() {
        System.out.println("I pressed the submit button");
    }

    public void redirectToPage(String pageName) {
        System.out.println("I should be redirected to the " + pageName + " page");
    }
}
