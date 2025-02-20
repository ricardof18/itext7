/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2023 Apryse Group NV
    Authors: Apryse Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.svg.css.impl;

import com.itextpdf.svg.SvgConstants;
import com.itextpdf.svg.renderers.impl.CircleSvgNodeRenderer;
import com.itextpdf.svg.renderers.impl.GroupSvgNodeRenderer;
import com.itextpdf.svg.renderers.impl.RectangleSvgNodeRenderer;
import com.itextpdf.svg.renderers.impl.UseSvgNodeRenderer;
import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.type.UnitTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class SvgNodeRendererInheritanceResolverUnitTest extends ExtendedITextTest{

    @Test
    public void applyInheritanceToSubTreeFillTest(){

        String expectedFillAttribute = "blue";

        UseSvgNodeRenderer newRoot = new UseSvgNodeRenderer();
        newRoot.setAttribute(SvgConstants.Attributes.FILL,expectedFillAttribute);

        GroupSvgNodeRenderer subTree = new GroupSvgNodeRenderer();
        RectangleSvgNodeRenderer rect =new RectangleSvgNodeRenderer();
        CircleSvgNodeRenderer circle = new CircleSvgNodeRenderer();

        subTree.addChild(rect);
        subTree.addChild(circle);

        SvgNodeRendererInheritanceResolver.applyInheritanceToSubTree(newRoot,subTree, null);

        Assert.assertEquals(expectedFillAttribute,subTree.getAttribute(SvgConstants.Attributes.FILL));
        Assert.assertEquals(expectedFillAttribute,rect.getAttribute(SvgConstants.Attributes.FILL));
        Assert.assertEquals(expectedFillAttribute,circle.getAttribute(SvgConstants.Attributes.FILL));
    }
}
