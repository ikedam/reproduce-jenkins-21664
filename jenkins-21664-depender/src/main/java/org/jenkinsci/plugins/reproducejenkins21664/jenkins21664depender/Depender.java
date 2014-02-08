/*
 * The MIT License
 * 
 * Copyright (c) 2014 IKEDA Yasuyuki
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.jenkinsci.plugins.reproducejenkins21664.jenkins21664depender;

import java.util.Collections;

import org.jenkinsci.plugins.reproducejenkins21664.jenkins21664dependee.Dependee;

import jenkins.model.Jenkins;
import hudson.Extension;
import hudson.model.Descriptor;
import hudson.model.Describable;

/**
 *
 */
public class Depender implements Describable<Depender>
{
    public void doSomething()
    {
        if (Jenkins.getInstance().getPlugin("jenkins-21664-dependee") != null)
        {
            for(Exception r: Collections.<Dependee>emptyList())
            {
                doSomething(r);
            }
        }
    }
    
    private void doSomething(Exception r)
    {
    }
    
    public Descriptor<Depender> getDescriptor()
    {
        return null;
    }
    
    @Extension
    public static class DescriptorImpl extends Descriptor<Depender>
    {
        @Override
        public String getDisplayName()
        {
            return null;
        }
    }
}
