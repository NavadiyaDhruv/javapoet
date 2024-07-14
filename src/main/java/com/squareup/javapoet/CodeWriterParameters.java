package com.squareup.javapoet;

import java.util.Map;
import java.util.Set;

public class CodeWriterParameters {
    private final Appendable out;
    private final String indent;
    private final Map<String, ClassName> importedTypes;
    private final Set<String> staticImports;
    private final Set<String> alwaysQualify;

    public CodeWriterParameters(Appendable out, String indent, Map<String, ClassName> importedTypes, Set<String> staticImports, Set<String> alwaysQualify) {
        this.out = out;
        this.indent = indent;
        this.importedTypes = importedTypes;
        this.staticImports = staticImports;
        this.alwaysQualify = alwaysQualify;
    }

    public Appendable getOut() {
        return out;
    }

    public String getIndent() {
        return indent;
    }

    public Map<String, ClassName> getImportedTypes() {
        return importedTypes;
    }

    public Set<String> getStaticImports() {
        return staticImports;
    }

    public Set<String> getAlwaysQualify() {
        return alwaysQualify;
    }
}
