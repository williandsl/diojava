public class Smartphone {
    public static void main(String[] args) {
        Service smartphone = new Service();

        System.out.println("-----Music Player-----");
        smartphone.playMusic();
        smartphone.pauseMusic();
        smartphone.selectMusic("The Neighbourhood - Reflections");

        System.out.println("-----Telephone-----");
        smartphone.makeCall("99999");
        smartphone.answerCall();
        smartphone.startVoicemail();

        System.out.println("-----Internet Browser-----");
        smartphone.displayWebPage("https://www.apple.com");
        smartphone.addNewTab();
        smartphone.refreshWebPage();
    }
}
