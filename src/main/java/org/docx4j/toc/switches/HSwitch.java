/*
 *  Copyright 2013, Plutext Pty Ltd.
 *   
 *  This file is part of the Commercial Edition of docx4j,
 *  which is licensed under the Plutext Commercial License (the "License"); 
 *  you may not use this file except in compliance with the License. 
 *  
 *  In particular, this source code is CONFIDENTIAL, and you must ensure it
 *  stays that way. 
 *
 *  You may obtain a copy of the License at 
 *
 *      http://www.plutext.com/license/Plutext_Commercial_License.pdf 
 *
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License.
 */
package org.docx4j.toc.switches;

import org.docx4j.wml.Style;

/**
 * hyperlinks switch
 */
public class HSwitch extends AbstractSwitch{

    public static final String ID = "\\h";
    private static final int PRIORITY = 6;

    @Override
    public boolean hasFieldArgument() {
        return false;
    }

    @Override
    public void process(Style s, SwitchProcessor sp) {
        sp.getEntry().makeHyperlink(true);
    }

    @Override
    public int getPriority() {
        return PRIORITY;
    }
}
