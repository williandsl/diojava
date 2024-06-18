class Service {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private Telephone telephone = new Telephone();
    private InternetBrowser internetBrowser = new InternetBrowser();

    public void playMusic() {
        musicPlayer.play();
    }

    public void pauseMusic() {
        musicPlayer.pause();
    }

    public void selectMusic(String music) {
        musicPlayer.selectMusic(music);
    }

    public void makeCall(String phoneNumber) {
        telephone.call(phoneNumber);
    }

    public void answerCall() {
        telephone.answer();
    }

    public void startVoicemail() {
        telephone.startVoicemail();
    }

    public void displayWebPage(String url) {
        internetBrowser.displayPage(url);
    }

    public void addNewTab() {
        internetBrowser.addNewTab();
    }

    public void refreshWebPage() {
        internetBrowser.refreshPage();
    }
}
