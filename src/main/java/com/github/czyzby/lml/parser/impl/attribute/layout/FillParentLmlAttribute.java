package com.github.czyzby.lml.parser.impl.attribute.layout;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;

/** See {@link Layout#setFillParent(boolean)}. By default, mapped to "fillParent" attribute name.
 *
 * @author MJ */
public class FillParentLmlAttribute extends AbstractLayoutLmlAttribute {
    @Override
    protected void process(final LmlParser parser, final LmlTag tag, final Layout layout, final Actor actor,
            final String rawAttributeData) {
        layout.setFillParent(parser.parseBoolean(rawAttributeData, actor));
    }
}
