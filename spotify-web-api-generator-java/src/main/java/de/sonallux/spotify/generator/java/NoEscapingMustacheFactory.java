package de.sonallux.spotify.generator.java;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.MustacheException;

import java.io.IOException;
import java.io.Writer;

class NoEscapingMustacheFactory extends DefaultMustacheFactory {
    @Override
    public void encode(String value, Writer writer) {
        try {
            writer.write(value);
        } catch (IOException e) {
            throw new MustacheException("Failed to encode value: " + value, e);
        }
    }
}
