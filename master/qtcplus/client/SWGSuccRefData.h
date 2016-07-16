/*
 * SWGSuccRefData.h
 * 
 * 
 */

#ifndef SWGSuccRefData_H_
#define SWGSuccRefData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccRefData: public SWGObject {
public:
    SWGSuccRefData();
    SWGSuccRefData(QString* json);
    virtual ~SWGSuccRefData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccRefData* fromJson(QString &jsonString);

    double getRefPercent();
    void setRefPercent(double refPercent);
qint64 getTime();
    void setTime(qint64 time);
QString* getRefID();
    void setRefID(QString* refID);
bool getEmailVerified();
    void setEmailVerified(bool emailVerified);
bool getKycComplete();
    void setKycComplete(bool kycComplete);
qint64 getBtcEarned();
    void setBtcEarned(qint64 btcEarned);
qint64 getFiatEarned();
    void setFiatEarned(qint64 fiatEarned);

private:
    double refPercent;
qint64 time;
QString* refID;
bool emailVerified;
bool kycComplete;
qint64 btcEarned;
qint64 fiatEarned;
};

} /* namespace Swagger */

#endif /* SWGSuccRefData_H_ */
