package com.sample;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.io.Resource;
import org.kie.internal.io.ResourceFactory;

public class SimpleGenerateDrlFileFromDecisionTable 
{
	private static final String DECISION_TABLE_PATH = "src/main/resources/com/sample/dtables";
	private static final String DECISION_TABLE_FILE = "offers.xlsx";
	private static final String OUTPUT_FOLDER = "target/decision-table-drl/";

	public static void main(final String[] args) throws Exception {

		SpreadsheetCompiler spreadsheetCompiler = new SpreadsheetCompiler();

		InputType inputType = InputType.XLS;
		Resource resource = ResourceFactory.newFileResource(DECISION_TABLE_PATH + DECISION_TABLE_FILE);
		InputStream inputStream = resource.getInputStream();

		String drlRules = spreadsheetCompiler.compile(inputStream, inputType);

		File outputFolder = new File(OUTPUT_FOLDER);
		outputFolder.mkdir();

		PrintWriter out = new PrintWriter(OUTPUT_FOLDER + DECISION_TABLE_FILE + ".drl");
		out.println(drlRules);
		out.close();

		System.exit(0);
}
}
