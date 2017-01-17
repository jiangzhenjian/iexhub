/*******************************************************************************
 * Copyright (c) 2015, 2016 Substance Abuse and Mental Health Services Administration (SAMHSA)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Eversolve, LLC - initial IExHub implementation for Health Information Exchange (HIE) integration
 *     Anthony Sute, Ioana Singureanu
 *******************************************************************************/
package org.iexhub.services;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author A. Sute
 */
@Deprecated
@XmlRootElement
public class GetPatientDataResponse {
    private List<Object> documents = new ArrayList<>();
    private List<String> errorMsgs = new ArrayList<>();

    public List<Object> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Object> documents) {
        this.documents = documents;
    }

    public List<String> getErrorMsgs() {
        return errorMsgs;
    }

    public void setErrorMsgs(List<String> errorMsgs) {
        this.errorMsgs = errorMsgs;
    }
}
