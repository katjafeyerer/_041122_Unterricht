package org.campus02.thenewsocialmedia;

public class SocialNetworkApp {
    public static void main(String[] args) {
        Profile susi = new Profile("susi.sorglos@test.com", 29,
                "Susi Sorglos", "56124...", 3900);
        susi.printPublicPage(AccessRoles.Platform);

        Profile max = new Profile("max.mustermann@nts.eu", 31, "Max Mustermann",
                "34546", 2800);
        max.printPublicPage(AccessRoles.Self);

        susi.setBestFriend(max);

        susi.printPublicPage(AccessRoles.RegisteredCustomer);
    }
}
