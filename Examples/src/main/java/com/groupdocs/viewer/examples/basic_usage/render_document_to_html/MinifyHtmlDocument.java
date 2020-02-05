package com.groupdocs.viewer.examples.basic_usage.render_document_to_html;

import com.groupdocs.viewer.Viewer;
import com.groupdocs.viewer.examples.SampleFiles;
import com.groupdocs.viewer.examples.Utils;
import com.groupdocs.viewer.options.HtmlViewOptions;

import java.io.File;
import java.io.IOException;

public class MinifyHtmlDocument {

    /**
     * This example demonstrates how to enable minification of HTML document.
     */
    
    public static void run() throws IOException {
        String outputDirectory = Utils.getOutputDirectoryPath("MinifyHtmlDocument");
        String pageFilePathFormat = new File(outputDirectory, "page_{0}.html").getPath();

        HtmlViewOptions viewOptions = HtmlViewOptions.forEmbeddedResources(pageFilePathFormat);
        viewOptions.setMinify(true);

        Viewer viewer = new Viewer(SampleFiles.SAMPLE_DOCX);
        viewer.view(viewOptions);
        viewer.close();

        System.out.println(
                String.format("\nSource document rendered successfully.\nCheck output in '%s'.", outputDirectory));
    }
}