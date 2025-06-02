public class MainApp {
    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (standard Swing practice)
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Create and show your GUI window (example: MilestoneCalculator)
            new MilestoneCalculator().setVisible(true);
        });
    }
}



