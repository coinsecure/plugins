/*
 * SWGTradeAddressData.h
 * 
 * 
 */

#ifndef SWGTradeAddressData_H_
#define SWGTradeAddressData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGTradeAddressData: public SWGObject {
public:
    SWGTradeAddressData();
    SWGTradeAddressData(QString* json);
    virtual ~SWGTradeAddressData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeAddressData* fromJson(QString &jsonString);

    QString* getAddress();
    void setAddress(QString* address);
qint64 getTime();
    void setTime(qint64 time);
QString* getInfo();
    void setInfo(QString* info);
QString* getNetki();
    void setNetki(QString* netki);

private:
    QString* address;
qint64 time;
QString* info;
QString* netki;
};

} /* namespace Swagger */

#endif /* SWGTradeAddressData_H_ */
