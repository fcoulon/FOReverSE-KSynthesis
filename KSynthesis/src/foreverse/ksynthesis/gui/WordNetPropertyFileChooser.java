package foreverse.ksynthesis.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;
import fr.familiar.gui.FamiliarEditor;


public class WordNetPropertyFileChooser {

	private WordNetPropertyFileChooser() {

	}

	/**
	 * Return the current instance of the WordNet dictionary or null if it does not exist
	 * @return
	 */
	public static File getInstance() {
		File propertiesFile = null;
		JFileChooser fileChooser = new JFileChooser();
		int choice = fileChooser.showOpenDialog(FamiliarEditor.INSTANCE);
		if (choice == JFileChooser.APPROVE_OPTION) {
			propertiesFile = fileChooser.getSelectedFile();
			//				try {
			//					dictionary = Dictionary.getInstance(new FileInputStream(propertiesFile));
			//					Dictionary.setInstance(dictionary);
			//				} catch (FileNotFoundException e) {
			//					e.printStackTrace();
			//				} catch (JWNLException e) {
			//					e.printStackTrace();
			//				}
		}	
		return propertiesFile;
	}

}
