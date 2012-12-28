package net.sourceforge.devtool.encoding.preferences;

import net.sourceforge.devtool.encoding.EncodingPlugin;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage </samp>,
 * we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class EncodingConverterPreferencePage extends FieldEditorPreferencePage
		implements IEncodingConverterPreferenceConstants,
		IWorkbenchPreferencePage {
	private BooleanFieldEditor checkBoxJAVA;

	private BooleanFieldEditor checkBoxDTD;

	private BooleanFieldEditor checkBoxCSS;

	private BooleanFieldEditor checkBoxXML;

	private BooleanFieldEditor checkBoxJSP;

	private BooleanFieldEditor checkBoxALL;

	public EncodingConverterPreferencePage() {
		super(GRID);
		setPreferenceStore(EncodingPlugin.getDefault().getPreferenceStore());
		setDescription(Messages.getString("EncodingConverterPreferencePage.0")); //$NON-NLS-1$
		setTitle(Messages.getString("EncodingConverterPreferencePage.1")); //$NON-NLS-1$
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */

	public void createFieldEditors() {
		checkBoxALL = new BooleanFieldEditor(P_ALL_FILES, Messages.getString("EncodingConverterPreferencePage.2"), //$NON-NLS-1$
				getFieldEditorParent());
		addField(checkBoxALL);

		{
			checkBoxJSP = new BooleanFieldEditor(P_JSP_FILES, Messages.getString("EncodingConverterPreferencePage.3"), //$NON-NLS-1$
					getFieldEditorParent());
			addField(checkBoxJSP);
		}

		{
			checkBoxXML = new BooleanFieldEditor(P_XML_FILES, Messages.getString("EncodingConverterPreferencePage.4"), //$NON-NLS-1$
					getFieldEditorParent());
			addField(checkBoxXML);
		}

		{
			checkBoxCSS = new BooleanFieldEditor(P_CSS_FILES, Messages.getString("EncodingConverterPreferencePage.5"), //$NON-NLS-1$
					getFieldEditorParent());
			addField(checkBoxCSS);
		}

		{
			checkBoxDTD = new BooleanFieldEditor(P_DTD_FILES, Messages.getString("EncodingConverterPreferencePage.6"), //$NON-NLS-1$
					getFieldEditorParent());
			addField(checkBoxDTD);
		}

		{
			checkBoxJAVA = new BooleanFieldEditor(P_JAVA_FILES, Messages.getString("EncodingConverterPreferencePage.7"), //$NON-NLS-1$
					getFieldEditorParent());
			addField(checkBoxJAVA);
		}
	}

	public void init(IWorkbench workbench) {
	}
}