/*
 * SWGTimeDataCoin.h
 * 
 * 
 */

#ifndef SWGTimeDataCoin_H_
#define SWGTimeDataCoin_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGTimeDataCoin: public SWGObject {
public:
    SWGTimeDataCoin();
    SWGTimeDataCoin(QString* json);
    virtual ~SWGTimeDataCoin();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTimeDataCoin* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
qint64 getVerifiedTime();
    void setVerifiedTime(qint64 verifiedTime);

private:
    qint64 time;
qint64 verifiedTime;
};

} /* namespace Swagger */

#endif /* SWGTimeDataCoin_H_ */
