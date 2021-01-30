package org.eminera.part04.lesson34.lesson;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * https://freemarker.apache.org/docs/ref_directives.html
 */
public class TemplateEngine {
  private final String basePath = "src/main/java/org/eminera/part04/lesson34/";
  private final String encoding = String.valueOf(StandardCharsets.UTF_8);
  private final Configuration conf;

  private TemplateEngine(String path) throws IOException {
    this.conf = new Configuration(Configuration.VERSION_2_3_30) {{
      setDirectoryForTemplateLoading(new File(basePath.concat(path)));
      setDefaultEncoding(encoding);
      setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
      setWrapUncheckedExceptions(true);
      setLogTemplateExceptions(false);
    }};
  }

  public static TemplateEngine folder(String path) throws IOException {
    return new TemplateEngine(path);
  }

  public void render(String template, HashMap<String, Object> data, HttpServletResponse resp) {
    resp.setCharacterEncoding(encoding);

    try (PrintWriter writer = resp.getWriter()) {
      this.conf.getTemplate(template).process(data, writer);
    } catch (IOException | TemplateException e) {
      throw new RuntimeException("Freemarker error", e);
    }
  }

}