/**
 * Coinsecure Api Documentation
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * SWGFiatBankData.h
 * 
 * 
 */

#ifndef SWGFiatBankData_H_
#define SWGFiatBankData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatBankData: public SWGObject {
public:
    SWGFiatBankData();
    SWGFiatBankData(QString* json);
    virtual ~SWGFiatBankData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatBankData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);

    QString* getStatus();
    void setStatus(QString* status);

    qint64 getUpdateTime();
    void setUpdateTime(qint64 update_time);

    QString* getUpdateMessage();
    void setUpdateMessage(QString* update_message);

    QString* getBankId();
    void setBankId(QString* bank_id);

    QString* getInfo();
    void setInfo(QString* info);

    QString* getAccountNumber();
    void setAccountNumber(QString* account_number);

    QString* getAccountNick();
    void setAccountNick(QString* account_nick);

    QString* getAccountType();
    void setAccountType(QString* account_type);

    QString* getAccountId();
    void setAccountId(QString* account_id);


private:
    qint64 time;
    QString* status;
    qint64 update_time;
    QString* update_message;
    QString* bank_id;
    QString* info;
    QString* account_number;
    QString* account_nick;
    QString* account_type;
    QString* account_id;
};

} /* namespace Swagger */

#endif /* SWGFiatBankData_H_ */
